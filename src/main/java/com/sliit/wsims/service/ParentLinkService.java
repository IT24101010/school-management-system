package com.sliit.wsims.service;

import com.sliit.wsims.entity.StudentParentLink;
import com.sliit.wsims.entity.Student;
import com.sliit.wsims.entity.Parent;
import com.sliit.wsims.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface ParentLinkService {
    StudentParentLink createLink(Long studentUserId, Long parentUserId, Long createdBy);
    void deleteLink(Long studentUserId, Long parentUserId);
    boolean linkExists(Long studentUserId, Long parentUserId);
    boolean isParentLinkedToStudent(Long parentUserId, Long studentUserId);
    Page<StudentParentLink> getAllLinks(String searchTerm, Pageable pageable);
    Page<StudentParentLink> getAllLinks(Pageable pageable);
    Page<StudentParentLink> searchLinksByStudentName(String searchTerm, Pageable pageable);
    Page<StudentParentLink> searchLinksByParentName(String searchTerm, Pageable pageable);
    List<User> getLinkedStudentsForParent(Long parentUserId);
    List<User> getLinkedParentsForStudent(Long studentUserId);
    Map<String, Long> getLinkStatistics();
    List<Student> getUnlinkedStudents();
    List<Parent> getUnlinkedParents();
}