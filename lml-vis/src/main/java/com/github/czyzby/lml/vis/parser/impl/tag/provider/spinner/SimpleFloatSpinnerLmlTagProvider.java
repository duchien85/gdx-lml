package com.github.czyzby.lml.vis.parser.impl.tag.provider.spinner;

import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.parser.tag.LmlTagProvider;
import com.github.czyzby.lml.vis.parser.impl.tag.spinner.SimpleFloatSpinnerLmlTag;

/** Provides spinner tags with float range models.
 *
 * @author MJ */
public class SimpleFloatSpinnerLmlTagProvider implements LmlTagProvider {
    @Override
    public LmlTag create(final LmlParser parser, final LmlTag parentTag, final StringBuilder rawTagData) {
        return new SimpleFloatSpinnerLmlTag(parser, parentTag, rawTagData);
    }
}