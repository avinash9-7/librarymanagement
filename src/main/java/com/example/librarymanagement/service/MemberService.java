package com.example.librarymanagement.service;

import com.example.librarymanagement.model.Member;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MemberService {

    private Map<Long, Member> memberStore = new HashMap<>();
    private Long idCounter = 1L;

    public Member addMember(Member member) {
        member.setId(idCounter++);
        memberStore.put(member.getId(), member);
        return member;
    }

    public Collection<Member> getAllMembers() {
        return memberStore.values();
    }

    public Member getMemberById(Long id) {
        return memberStore.get(id);
    }
    public Member updateMember(Long id, String name) {
        Member existing = memberStore.get(id);
        if (existing != null) {
            existing.setName(name);
        }
        return existing;
    }


    public void deleteMember(Long id) {
        memberStore.remove(id);
    }
}
