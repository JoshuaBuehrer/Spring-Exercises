package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping()
public class skillsControllers {
    @ResponseBody
    @GetMapping() //localhost:8080/hello/hello
    public String skills() {
        return "<h1>Skill tracker</h1>" +
                "<h2>We have a few skills to learn. here are a few.</h2>" +
                "<ol>" +
                "<li> java </li>" +
                "<li> c++ </li>" +
                "<li> javascript </li>";
    }

    @ResponseBody
    @PostMapping("form")
    public String formPost(@RequestParam String name, @RequestParam String language1,@RequestParam String language2,@RequestParam String language3){
        return "<html>" +
                 "<body>" +
                  "<form>" +
                  "<h1>" + name + "</h1>" +
                "<ol>" +
                    "<li>" + language1 + "</li>" +
                    "<li>" + language2 + "</li>" +
                    "<li>" + language3 + "</li>" +
                "</ol>" +
                "</h1>" +
                "</form>" +
                "</body>" +
                "</html>";

    }
    @ResponseBody
    @GetMapping("form")
    public String forms(){
        return "<html>" +
                "<body>" +
                "<form action='/form' method='post'>" +
                "<label>name:</label> <br>" +
                "<input type='text' name='name'/> <br>" +
                "<label>my favorite language:</label> <br>" +
                "<select name='language1' id='id'>" +
                "<option value='java'>java</option>" +
                "<option value='c++'>c++</option>" +
                "<option value='javascript'>javascript</option>" +
                "</select><br>" +
                "<label>my second favorite language:</label> <br>" +
                "<select name='language2' id='id2'>" +
                "<option value='java'>java</option>" +
                "<option value='c++'>c++</option>" +
                "<option value='javascript'>javascript</option>" +
                "</select> <br>" +
                "<label>my third favorite language:</label> <br>" +
                "<select name='language3' id='id3'>" +
                "<option value='java'>java</option>" +
                "<option value='c++'>c++</option>" +
                "<option value='javascript'>javascript</option>" +
                "</select><br>" +
                "<input type='submit' value='submit'/> " +
                "</form>" +
                "</body>" +
                "</html>";
    }



}
//
//    @ResponseBody
//    @GetMapping("hello/{name}") //localhost:8080/hello/hello/name
//    public String helloPath (@PathVariable String name) {
//        return String.format("<h1>Hello, %s!</h1>", name);
//    }
//
//    @ResponseBody
//    @RequestMapping(value="form", method = {RequestMethod.GET, RequestMethod.POST})
//    public String form(@RequestParam String name) { //handles at localhost:8080/hello/form
//        if (name.isBlank()) {
//            name = "LaunchCode";
//        } else if (name.equalsIgnoreCase("apple dog")) {
//            return "<h1>Hello, Banana Cat! <em>Also how dare you.</em> >:(</h1>";
//        }
//
//        return String.format("<h1>Hello, %s!</h1>", name);
//    }
//
//    @GetMapping
//    @ResponseBody
//    public String defaultForm () { //defaults to localhost:8080/hello
//        return "<html>" +
//                "<body>" +
//                "<form method = 'post' action = '/hello/form'>" +
//                "<input type = 'text' name = 'name'/>" +
//                "<input type = 'submit' value = 'Greet Me!' />" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }
//}