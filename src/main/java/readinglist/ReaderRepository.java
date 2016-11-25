package readinglist;

import org.springframework.data.jpa.repository.JpaRepository;



/**
 * Created by yookeun on 2016. 11. 25..
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
