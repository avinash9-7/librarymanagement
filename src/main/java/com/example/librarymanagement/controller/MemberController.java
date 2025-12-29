package com.example.librarymanagement.controller;

import com.example.librarymanagement.model.Member;
import com.example.librarymanagement.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class MemberController {

    private final MemberService service;

    public MemberController(MemberService service) {
        this.service = service;
    }

    // ===================== WEBSITE =====================

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("members", service.getAllMembers());
        model.addAttribute("member", new Member());
        return "members";
    }

    @PostMapping("/members")
    public String addMember(Member member) {
        service.addMember(member);
        return "redirect:/";
    }

    @GetMapping("/members/edit/{id}")
    public String editMember(@PathVariable Long id, Model model) {
        model.addAttribute("member", service.getMemberById(id));
        model.addAttribute("members", service.getAllMembers());
        return "members";
    }

    @PostMapping("/members/update")
    public String updateMember(Member member) {
        service.updateMember(member.getId(), member.getName());
        return "redirect:/";
    }

    @GetMapping("/members/delete/{id}")
    public String deleteMember(@PathVariable Long id) {
        service.deleteMember(id);
        return "redirect:/";
    }

    // ===================== REST APIs (POSTMAN) =====================

    @PostMapping("/api/members")
    @ResponseBody
    public Member addMemberApi(@RequestBody Member member) {
        return service.addMember(member);
    }


    @GetMapping("/api/members")
    @ResponseBody
    public Collection<Member> getAllMembersApi() {
        return service.getAllMembers();
    }

    @GetMapping("/api/members/{id}")
    @ResponseBody
    public Member getMemberByIdApi(@PathVariable Long id) {
        return service.getMemberById(id);
    }

    @PutMapping("/api/members/{id}")
    @ResponseBody
    public Member updateMemberApi(@PathVariable Long id,
                                  @RequestBody Member member) {
        return service.updateMember(id, member.getName());
    }
}
