package com.redditclone.repository;

import com.redditclone.domain.Vote;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long>{

    
}