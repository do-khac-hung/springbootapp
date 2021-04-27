package com.handess.springbootapp.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("app") // prefix app, find app.* values
@PropertySource("classpath:menu.properties")
public class MenuConfig {
    public static class Menu {
        private String name;
        private String path;
        private String title;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        // getter - setter
        @Override
        public String toString() {
            return "Menu{" + "name='" + name + '\'' + ", path='" + path + '\'' + ", title='" + title + '\'' + '}';
        }
    }
     private List<Menu> menus = new ArrayList<>();
        public List<Menu> getMenus() {
            return menus;
        }
        public void setMenus(List<Menu> menus) {
            this.menus = menus;
        }
}
