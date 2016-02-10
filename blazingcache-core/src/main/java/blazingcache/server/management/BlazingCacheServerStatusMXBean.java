/*
 * Copyright 2016 Diennea S.R.L..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package blazingcache.server.management;

import blazingcache.server.CacheServer;

/**
 * Blazing cache server's status on JMX.
 *
 * @author matteo.casadei
 * @since 1.5.0
 *
 */
public class BlazingCacheServerStatusMXBean implements CacheServerStatusMXBean {

    /**
     * the cache server the provided status refers to.
     */
    private final CacheServer server;

    /**
     * Builds a new MXBean to publish server status on JMX.
     *
     * @param server
     *            the {@see CacheServer} instance this
     *            MXBean refers to
     */
    public BlazingCacheServerStatusMXBean(final CacheServer server) {
        this.server = server;
    }

    /**
     * {@inheritDoc}
     */
    public long getCurrentTimestamp() {
        return this.server.getCurrentTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    public boolean isLeader() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public long lastStateChangeTimestamp() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public long getGlobalCacheSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public int getNumberOfConnectedClients() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public long getNumberOfLockedEntries() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public long getNumberOfPendingOperation() {
        // TODO Auto-generated method stub
        return 0;
    }

}
