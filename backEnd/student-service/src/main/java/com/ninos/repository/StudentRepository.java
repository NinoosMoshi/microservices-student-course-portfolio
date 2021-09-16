package com.ninos.repository;

import com.ninos.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findStudentByUsername(String username);


    // find students name by id
    @Query("select s.name from Student s where s.id in (:pIdList)")
    List<String> findByIdList(@Param("pIdList") List<Long> idList);

}
