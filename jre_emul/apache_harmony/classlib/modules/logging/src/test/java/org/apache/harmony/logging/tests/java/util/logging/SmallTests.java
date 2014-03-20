/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.harmony.logging.tests.java.util.logging;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SmallTests extends TestSuite {

  private static final Class<?>[] smallTestClasses = new Class[] {
    ConsoleHandlerTest.class,
    ErrorManagerTest.class,
    FilterTest.class,
    FormatterTest.class,
    HandlerTest.class,
    LevelTest.class,
    LogManagerTest.class,
    LogRecordTest.class,
    LoggerTest.class,
    MemoryHandlerTest.class,
    SimpleFormatterTest.class,
    StreamHandlerTest.class,
    XMLFormatterTest.class
  };

  public static Test suite() {
    return new TestSuite(smallTestClasses);
  }
}
