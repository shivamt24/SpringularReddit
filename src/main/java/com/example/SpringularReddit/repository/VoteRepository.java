package com.example.SpringularReddit.repository;

import com.example.SpringularReddit.model.Post;
import com.example.SpringularReddit.model.User;
import com.example.SpringularReddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
