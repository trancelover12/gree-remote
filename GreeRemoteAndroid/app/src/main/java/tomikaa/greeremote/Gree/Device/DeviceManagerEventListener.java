package tomikaa.greeremote.Gree.Device;

/*
 * This file is part of GreeRemoteAndroid.
 *
 * GreeRemoteAndroid is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GreeRemoteAndroid is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with GreeRemoteAndroid. If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Created by tomikaa87 <https://github.com/tomikaa87> on 2017-12-02.
 */

public interface DeviceManagerEventListener {
    enum Event {
        DEVICE_LIST_UPDATED,
        DEVICE_STATUS_UPDATED
    }

    void onEvent(Event event);
}
