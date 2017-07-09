package io.repseq.learn;

import com.milaboratory.core.sequence.NucleotideSequence;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by mikesh on 05/07/17.
 */
public interface GermlineSequenceProvider {
    NucleotideSequence getFullSequenceWithP(String id);
}
