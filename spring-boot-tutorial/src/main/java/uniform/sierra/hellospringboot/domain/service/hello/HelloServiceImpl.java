package uniform.sierra.hellospringboot.domain.service.hello;

import java.time.Clock;
import java.time.LocalDateTime;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uniform.sierra.hellospringboot.domain.model.HelloHistory;
import uniform.sierra.hellospringboot.domain.repository.HelloHistoryRepository;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloHistoryRepository helloHistoryRepos;

    @Autowired
    private Mapper beanMapper;

    @Autowired
    private Clock systemClock;

    @Override
    @Transactional
    public SayHelloResult sayHello(String name) {
        HelloHistory history = helloHistoryRepos.selectByName(name);
        if (history == null) {
            // first time.
            history = new HelloHistory();
            history.setName(name);
            history.setNum(1);
            history.setLastVisited(LocalDateTime.now(systemClock));
            helloHistoryRepos.insert(history);
        } else {
            // second time, and later
            history.setNum(history.getNum() + 1);
            history.setLastVisited(LocalDateTime.now(systemClock));
            helloHistoryRepos.update(history);
        }

        return beanMapper.map(history, SayHelloResult.class);
    }
}
