package com.goemon.portfolio.skill.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.goemon.portfolio.skill.model.Skill;

@Controller
public class SkillController {
    @GetMapping("/skills")
    public String skills(
            Model model
    ) {
        List<Skill> skills = List.of(
                    Skill.of("Spring", "★★★★★"),
                    Skill.of("AWS", "★★★★☆"),
                    Skill.of("Next.js", "★★☆☆☆")
                );

        model.addAttribute(
                "skills",
                skills
        );

        return "skills";
    }
}