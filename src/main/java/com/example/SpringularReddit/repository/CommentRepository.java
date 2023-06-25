package com.example.SpringularReddit.repository;

import com.example.SpringularReddit.model.Comment;
import com.example.SpringularReddit.model.Post;
import com.example.SpringularReddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
    List<Comment> findAllByUser(User user);
}
