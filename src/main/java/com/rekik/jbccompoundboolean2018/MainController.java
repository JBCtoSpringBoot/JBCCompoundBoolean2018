package com.rekik.jbccompoundboolean2018;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/** Project managers ask programmers to wrtite new software. They want it done fast, cheap and perfect.
 *   However, any good programmer will tell you the rule is: We can make it fast, cheap or good. Pick two**/

@Controller
public class MainController {

    Requirement requirement = new Requirement();

    boolean bFast = requirement.isbFast();
    boolean bCheap = requirement.isbCheap();
    boolean bGood = requirement.isbGood();

    @RequestMapping("/")
    public String showIndex(Model model)
    {

        return "questionform";
    }

    @PostMapping("/save")
    public String postAnswers(@RequestParam("bfast") String fast,@RequestParam("bcheap") String cheap,
                              @RequestParam("bgood") String good, Model model)
    {
        // you don't need the curly braces for a one liner if statement. You can use it if you prefer.
        if(fast.equalsIgnoreCase("y")){
            bFast = true;
        }

        if(cheap.equalsIgnoreCase("y")){
            bCheap = true;
        }

        if(good.equalsIgnoreCase("y")){
            bGood = true;
        }

        if(bFast != true && bCheap == true && bGood == true)
            model.addAttribute("answer","Ok, we'll make it cheap and good.");

        else if(bFast == true && bCheap != true && bGood==true)
            model.addAttribute("answer","Ok, we'll make it good and have it delivered fast.");

        else if(bFast == true && bCheap == true && bGood != true)
            model.addAttribute("answer","Ok, it'll be done right away.");

        else if(bFast != true && bCheap != true && bGood != true)
            model.addAttribute("answer","Please have some requirement");

        else
            model.addAttribute("answer","Sorry you can only have two!");


        return "answer";
    }
}
