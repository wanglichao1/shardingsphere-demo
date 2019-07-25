package cn.com.open.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShardingSphereRepository extends JpaRepository<ShardingSphere,Long> {
}
