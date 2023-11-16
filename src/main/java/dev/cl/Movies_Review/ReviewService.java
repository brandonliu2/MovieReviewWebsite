package dev.cl.Movies_Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository review_repo;

    @Autowired
    private MongoTemplate mongoTemplate;
    public Review createReview(String ReviewBody,String imdbId){
//        Review new_review = new Review(ReviewBody);
//        review_repo.insert(new_review);
        Review new_review = review_repo.insert(new Review(ReviewBody));
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(new_review))
                .first();
        return new_review;
    }
}
