package com.insightfullogic.java8.examples.chapter9;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_indexer_TestDataBuilder_test_memory_entity_compaction {

    @Test
    public void filtersAlbums() throws InterruptedException {
        RxExamples examples = new RxExamples(SampleData.getThreeArtists());
        Artist artist = examples.search("John", "UK", 5)
                .toBlockingObservable()
                .single();

        assertEquals(SampleData.johnLennon, artist);
    }
}
