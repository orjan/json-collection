/*
 * Copyright 2012 Erlend Hamnaberg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.hamnaberg.json;

import com.fasterxml.jackson.databind.JsonNode;
import net.hamnaberg.funclite.Optional;

public interface Value {
    boolean isBoolean();
    boolean isString();
    boolean isNumeric();
    boolean isNull();

    String asString();

    boolean asBoolean();

    Number asNumber();

    JsonNode asJson();

    Optional<Value> NONE = Optional.none();
}
