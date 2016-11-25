package readinglist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yookeun on 2016. 11. 24..
 */
public interface ReadingListRespository extends JpaRepository<Book, Long> {
    List<Book> findByReader(Reader reader);
}
