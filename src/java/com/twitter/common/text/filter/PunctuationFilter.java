// =================================================================================================
// Copyright 2011 Twitter, Inc.
// -------------------------------------------------------------------------------------------------
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this work except in compliance with the License.
// You may obtain a copy of the License in the LICENSE file, or at:
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// =================================================================================================

package com.twitter.common.text.filter;

import com.twitter.common.text.token.TwitterTokenStream;
import com.twitter.common.text.token.attribute.TokenType;

/**
 * Filters out tokens whose {@code TokenTypeAttribute} is {@code TokenType.PUNCTUATION}.
 */
public class PunctuationFilter extends TokenTypeFilter {
  public PunctuationFilter(TwitterTokenStream inputStream) {
    super(inputStream);
    setTypesToFilter(TokenType.PUNCTUATION);
    setMode(TokenTypeFilter.Mode.REJECT);
  }
}
