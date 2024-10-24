package com.prj.repo;


import com.prj.domain.HireNum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//用@Conponent注解，放入Spring容器中
@Component
public interface HirenumRepo extends JpaRepository<HireNum, Long> {

}
