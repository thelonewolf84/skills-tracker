package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String homePage(){
        return "<html>" +
                    "<body>" +
                        "<h1>" +
                            "Skills Tracker" +
                        "</h1>"+
                        "<h2>" +
                            "We have a few skills we would like to learn. Here are a few." +
                        "</h2>" +
                        "<ol>" +
                            "<li>" + "Java" + "</li>" +
                            "<li>" + "Javascript" + "</li>" +
                            "<li>" + "Python" + "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String formPage(){
        return
                "<html>" +
                        "<body>" +
                            "<form method = 'GET' action = '/hello'>" +
                                "<h2>Name:</h2>"+
                                "<input type = 'text' name = 'name' />" +
                                "<br>" +
                                "<h2>My favorite language is:</h2>" +
                                "<select name= 'firstFavLanguage'>" +
                                    "<option value = 'java'> Java </option>" +
                                    "<option value = 'javascript'> Javascript </option>" +
                                    "<option value = 'python'> Python </option>" +
                                "</select>" +
                                "<br>" +
                                "<h2>My second favorite language is:</h2>" +
                                "<select name= 'secondFavLanguage'>" +
                                    "<option value2 = 'java'> Java </option>" +
                                    "<option value2 = 'javascript'> Javascript </option>" +
                                    "<option value2 = 'python'> Python </option>" +
                                "</select>" +
                                "<br>" +
                                "<h2>My third favorite language is:</h2>" +
                                "<select name= 'thirdFavLanguage'>" +
                                    "<option value3 = 'java'> Java </option>" +
                                    "<option value3 = 'javascript'> Javascript </option>" +
                                    "<option value3 = 'python'> Python </option>" +
                                "</select>" +
                                "<br />" +
                            "<input type = 'submit' value = 'Greet Me!' />" +
                        "</body>" +
                "</html>";
    }

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, @RequestParam String firstFavLanguage, @RequestParam String secondFavLanguage, @RequestParam String thirdFavLanguage) {
        return
                "<html>" +
                        "<body>" +
                            "<h1>" + name + "</h1>" +
                            "<ol>" +
                                "<li>" + firstFavLanguage + "</li>" +
                                "<li>" + secondFavLanguage + "</li>" +
                                "<li>" + thirdFavLanguage + "</li>" +
                            "</ol>" +
                        "</body>" +
                "</html>";

    }


}
