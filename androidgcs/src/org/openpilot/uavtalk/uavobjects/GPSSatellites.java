/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Contains information about the GPS satellites in view from @ref GPSModule.
 *
 * @see        The GNU Public License (GPL) Version 3
 *
 *****************************************************************************/
/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.openpilot.uavtalk.uavobjects;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openpilot.uavtalk.UAVObjectManager;
import org.openpilot.uavtalk.UAVObject;
import org.openpilot.uavtalk.UAVDataObject;
import org.openpilot.uavtalk.UAVObjectField;

/**
Contains information about the GPS satellites in view from @ref GPSModule.

generated from gpssatellites.xml
 **/
public class GPSSatellites extends UAVDataObject {

	public GPSSatellites() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> SatsInViewElemNames = new ArrayList<String>();
		SatsInViewElemNames.add("0");
		fields.add( new UAVObjectField("SatsInView", "", UAVObjectField.FieldType.INT8, SatsInViewElemNames, null) );

		List<String> PRNElemNames = new ArrayList<String>();
		PRNElemNames.add("0");
		PRNElemNames.add("1");
		PRNElemNames.add("2");
		PRNElemNames.add("3");
		PRNElemNames.add("4");
		PRNElemNames.add("5");
		PRNElemNames.add("6");
		PRNElemNames.add("7");
		PRNElemNames.add("8");
		PRNElemNames.add("9");
		PRNElemNames.add("10");
		PRNElemNames.add("11");
		PRNElemNames.add("12");
		PRNElemNames.add("13");
		PRNElemNames.add("14");
		PRNElemNames.add("15");
		fields.add( new UAVObjectField("PRN", "", UAVObjectField.FieldType.INT8, PRNElemNames, null) );

		List<String> ElevationElemNames = new ArrayList<String>();
		ElevationElemNames.add("0");
		ElevationElemNames.add("1");
		ElevationElemNames.add("2");
		ElevationElemNames.add("3");
		ElevationElemNames.add("4");
		ElevationElemNames.add("5");
		ElevationElemNames.add("6");
		ElevationElemNames.add("7");
		ElevationElemNames.add("8");
		ElevationElemNames.add("9");
		ElevationElemNames.add("10");
		ElevationElemNames.add("11");
		ElevationElemNames.add("12");
		ElevationElemNames.add("13");
		ElevationElemNames.add("14");
		ElevationElemNames.add("15");
		fields.add( new UAVObjectField("Elevation", "degrees", UAVObjectField.FieldType.FLOAT32, ElevationElemNames, null) );

		List<String> AzimuthElemNames = new ArrayList<String>();
		AzimuthElemNames.add("0");
		AzimuthElemNames.add("1");
		AzimuthElemNames.add("2");
		AzimuthElemNames.add("3");
		AzimuthElemNames.add("4");
		AzimuthElemNames.add("5");
		AzimuthElemNames.add("6");
		AzimuthElemNames.add("7");
		AzimuthElemNames.add("8");
		AzimuthElemNames.add("9");
		AzimuthElemNames.add("10");
		AzimuthElemNames.add("11");
		AzimuthElemNames.add("12");
		AzimuthElemNames.add("13");
		AzimuthElemNames.add("14");
		AzimuthElemNames.add("15");
		fields.add( new UAVObjectField("Azimuth", "degrees", UAVObjectField.FieldType.FLOAT32, AzimuthElemNames, null) );

		List<String> SNRElemNames = new ArrayList<String>();
		SNRElemNames.add("0");
		SNRElemNames.add("1");
		SNRElemNames.add("2");
		SNRElemNames.add("3");
		SNRElemNames.add("4");
		SNRElemNames.add("5");
		SNRElemNames.add("6");
		SNRElemNames.add("7");
		SNRElemNames.add("8");
		SNRElemNames.add("9");
		SNRElemNames.add("10");
		SNRElemNames.add("11");
		SNRElemNames.add("12");
		SNRElemNames.add("13");
		SNRElemNames.add("14");
		SNRElemNames.add("15");
		fields.add( new UAVObjectField("SNR", "", UAVObjectField.FieldType.INT8, SNRElemNames, null) );


		// Compute the number of bytes for this object
		int numBytes = 0;
		ListIterator<UAVObjectField> li = fields.listIterator();
		while(li.hasNext()) {
			numBytes += li.next().getNumBytes();
		}
		NUMBYTES = numBytes;

		// Initialize object
		initializeFields(fields, ByteBuffer.allocate(NUMBYTES), NUMBYTES);
		// Set the default field values
		setDefaultFieldValues();
		// Set the object description
		setDescription(DESCRIPTION);
	}

	/**
	 * Create a Metadata object filled with default values for this object
	 * @return Metadata object with default values
	 */
	public Metadata getDefaultMetadata() {
		UAVObject.Metadata metadata = new UAVObject.Metadata();
		metadata.gcsAccess = UAVObject.AccessMode.ACCESS_READWRITE;
		metadata.gcsTelemetryAcked = UAVObject.Acked.FALSE;
		metadata.gcsTelemetryUpdateMode = UAVObject.UpdateMode.UPDATEMODE_MANUAL;
		metadata.gcsTelemetryUpdatePeriod = 0;

		metadata.flightAccess = UAVObject.AccessMode.ACCESS_READWRITE;
		metadata.flightTelemetryAcked = UAVObject.Acked.FALSE;
		metadata.flightTelemetryUpdateMode = UAVObject.UpdateMode.UPDATEMODE_PERIODIC;
		metadata.flightTelemetryUpdatePeriod = 10000;

		metadata.loggingUpdateMode = UAVObject.UpdateMode.UPDATEMODE_PERIODIC;
		metadata.loggingUpdatePeriod = 30000;
		return metadata;
	}

	/**
	 * Initialize object fields with the default values.
	 * If a default value is not specified the object fields
	 * will be initialized to zero.
	 */
	public void setDefaultFieldValues()
	{

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(int instID) {
		// TODO: Need to get specific instance to clone
		try {
			GPSSatellites obj = new GPSSatellites();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public GPSSatellites GetInstance(UAVObjectManager objMngr, int instID)
	{
	    return (GPSSatellites)(objMngr.getObject(GPSSatellites.OBJID, instID));
	}

	// Constants
	protected static final int OBJID = 0xD62FA3AE;
	protected static final String NAME = "GPSSatellites";
	protected static String DESCRIPTION = "Contains information about the GPS satellites in view from @ref GPSModule.";
	protected static final boolean ISSINGLEINST = 1 == 1;
	protected static final boolean ISSETTINGS = 0 == 1;
	protected static int NUMBYTES = 0;


}