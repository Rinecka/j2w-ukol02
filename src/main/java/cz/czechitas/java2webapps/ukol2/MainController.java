package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    private final Random random = new Random();

    @GetMapping("/")

     public ModelAndView randomPictureAndQuote() {

        int randomPicture = random.nextInt(6) + 1; //obrazky 1-6
        int randomQuoteNo = random.nextInt(8) ; //pocitam od nuly, takze posledni citat ma cislo 7
        List<String> quoteList=List.of("Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
                "A user interface is like a joke. If you have to explain it, it's not that good.",
                "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
                "I have a joke on programming but it only works on my computer.",
                "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
                "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
                "Programmer (noun.): A machine that turns coffee into code.",
                "Real programmers count from 0.");
        String randomQuote = quoteList.get(randomQuoteNo);

        ModelAndView result = new ModelAndView("index");
        result.addObject("picture", randomPicture);
        result.addObject("quote", randomQuote);
        return result;
    }
}