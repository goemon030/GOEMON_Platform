package com.goemon.portfolio.skill.model;

public class Skill {
    private String name;
    private String level;

    public static Skill of(String name, String level) {
        return new Skill(name, level);
    }

    // ofメソッドでのオブジェクト生成を強制させる（今後、引数のバリデーションを追加するときのため）
    private Skill(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }
}