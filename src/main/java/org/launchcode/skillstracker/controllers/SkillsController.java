package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String createHomepage() {
        return "<html><body>"+
                "<h1>Skills Tracker</h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Ruby</li>" +
                "<li>JavaScript</li>" +
                "</ol>" +
                "<html></body>";

    }

    @GetMapping("/form")
    @ResponseBody
    public String createForm() {
        return "<html><body>"+
                    "<form method='post'>" +
                    "<label>Name<input type = 'text' name='name' /></label><br />" +
                    "<label> My first language of choice</label>" +
                    "<select name='firstLang' id='firstLang'>" +
                    "<option value= 'Java'>Java</option>" +
                    "<option value= 'JavaScript'>JavaScript </option>" +
                    "<option value= 'Ruby'>Ruby</option><br />" +
                    "</select></label><br />" +
                     "<label> My second language of choice</label>" +
                    "<select name='secondLang' id='secondLang'>" +
                    "<option value= 'Java'>Java</option>" +
                    "<option value= 'JavaScript'>JavaScript </option>" +
                    "<option value= 'Ruby'>Ruby</option>" +
                    "</select></label><br />" +
                    "<label> My third language of choice</label>" +
                    "<select name='thirdLang' id='thirdLang'>" +
                    "<option value= 'Java'>Java</option>" +
                    "<option value= 'JavaScript'>JavaScript </option>" +
                    "<option value= 'Ruby'>Ruby</option>" +
                    "</select></label><br />" +
                    "<input type='submit' value='Submit!!'/>" +
                "<html></body>";
    }

    @PostMapping("/form")
    @ResponseBody

    public String respondToFormSubmission(@RequestParam String name, @RequestParam String firstLang, @RequestParam String secondLang, @RequestParam String thirdLang){
        return "<html><body>"+
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLang + "</li>" +
                "<li>" + secondLang + "</li>" +
                "<li>" + thirdLang + "</li>" +
                "</ol>" +
                "<html></body>";
    }

}
