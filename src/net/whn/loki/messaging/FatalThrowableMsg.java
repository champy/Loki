/**
 *Project: Loki Render - A distributed job queue manager.
 *Version 0.6.2b
 *Copyright (C) 2013 Daniel Petersen
 *Created on Aug 29, 2009
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

/**
 *
 * @author daniel
 */
public class FatalThrowableMsg extends Msg {

    public FatalThrowableMsg(MsgType m, Throwable e) {
        super(m);
        throwable = e;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    /*BEGIN PRIVATE*/

    Throwable throwable;

}
