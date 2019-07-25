package cn.com.open.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
public class TestController {
    @Autowired
    private ShardingSphereRepository shardingSphereRepository;
    @GetMapping("get")
    @Transactional(rollbackFor = Exception.class)
    public List<ShardingSphere> get(){
        ShardingSphere shardingSphere=new ShardingSphere();
        shardingSphere.setFlag(false);
        shardingSphere.setName("测试");
        shardingSphereRepository.save(shardingSphere);
        return shardingSphereRepository.findAll();
    }
}
