package com.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapi.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}