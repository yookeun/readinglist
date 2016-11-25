package readinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by yookeun on 2016. 11. 24..
 */

@Controller
@RequestMapping("/")
public class ReadingListController {
    private static final String reader = "craig";
    private ReadingListRespository readingListRespository;

    @Autowired
    public ReadingListController(ReadingListRespository readingListRespository) {
        this.readingListRespository = readingListRespository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String readersBooks(Reader reader, Model model) {
        List<Book> readingList = readingListRespository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
            model.addAttribute("reader", reader);
        }
        return "readingList";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addToReadingList(Reader reader, Book book) {
        book.setReader(reader);
        readingListRespository.save(book);
        return "redirect:/";
    }
}
