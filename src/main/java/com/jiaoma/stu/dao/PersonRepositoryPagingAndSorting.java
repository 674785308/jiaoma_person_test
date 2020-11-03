package com.jiaoma.stu.dao;

import com.jiaoma.stu.pojo.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepositoryPagingAndSorting extends PagingAndSortingRepository<Person,Integer> {
}
