/**
 *Project: Loki Render - A distributed job queue manager.
 *Version 0.6.2b
 *Copyright (C) 2013 Daniel Petersen
 *Created on Aug 12, 2009
 */

/**
 *This program is free software: you can redistribute it and/or modify
 *it under the terms of the GNU General Public License as published by
 *the Free Software Foundation, either version 3 of the License, or
 *(at your option) any later version.
 *
 *This program is distributed in the hope that it will be useful,
 *but WITHOUT ANY WARRANTY; without even the implied warranty of
 *MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License
 *along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.whn.loki.messaging;

import net.whn.loki.common.ICommon;

/**
 *
 * @author daniel
 */
public class Msg implements ICommon {

    public Msg(MsgType mType) {
        type = mType;
    }

    /**
     * fetches the message's type, as defined in the ICommon interface
     * @return
     */
    public MsgType getType () {
        return type;
    }

    /*BEGIN PRIVATE*/
    private final MsgType type;
}
