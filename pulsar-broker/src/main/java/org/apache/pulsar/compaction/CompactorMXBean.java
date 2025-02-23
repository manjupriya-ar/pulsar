/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pulsar.compaction;

import org.apache.bookkeeper.common.annotation.InterfaceAudience;
import org.apache.bookkeeper.common.annotation.InterfaceStability;

/**
 * JMX Bean interface for Compactor stats.
 */
@InterfaceAudience.LimitedPrivate
@InterfaceStability.Stable
public interface CompactorMXBean {

    /**
     * @return the removed event count of last compaction
     */
    long getLastCompactionRemovedEventCount(String topic);

    /**
     * @return the timestamp of last succeed compaction
     */
    long getLastCompactionSucceedTimestamp(String topic);

    /**
     * @return the timestamp of last failed compaction
     */
    long getLastCompactionFailedTimestamp(String topic);

    /**
     * @return the duration time of last compaction
     */
    long getLastCompactionDurationTimeInMills(String topic);

    /**
     *  Remove metrics about this topic.
     * @param topic
     */
    void removeTopic(String topic);

}
