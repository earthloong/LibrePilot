/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Status for the matrix mixer showing the output of each mixer after all scaling
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
Status for the matrix mixer showing the output of each mixer after all scaling

generated from mixerstatus.xml
 **/
public class MixerStatus extends UAVDataObject {

	public MixerStatus() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> Mixer1ElemNames = new ArrayList<String>();
		Mixer1ElemNames.add("0");
		fields.add( new UAVObjectField("Mixer1", "", UAVObjectField.FieldType.FLOAT32, Mixer1ElemNames, null) );

		List<String> Mixer2ElemNames = new ArrayList<String>();
		Mixer2ElemNames.add("0");
		fields.add( new UAVObjectField("Mixer2", "", UAVObjectField.FieldType.FLOAT32, Mixer2ElemNames, null) );

		List<String> Mixer3ElemNames = new ArrayList<String>();
		Mixer3ElemNames.add("0");
		fields.add( new UAVObjectField("Mixer3", "", UAVObjectField.FieldType.FLOAT32, Mixer3ElemNames, null) );

		List<String> Mixer4ElemNames = new ArrayList<String>();
		Mixer4ElemNames.add("0");
		fields.add( new UAVObjectField("Mixer4", "", UAVObjectField.FieldType.FLOAT32, Mixer4ElemNames, null) );

		List<String> Mixer5ElemNames = new ArrayList<String>();
		Mixer5ElemNames.add("0");
		fields.add( new UAVObjectField("Mixer5", "", UAVObjectField.FieldType.FLOAT32, Mixer5ElemNames, null) );

		List<String> Mixer6ElemNames = new ArrayList<String>();
		Mixer6ElemNames.add("0");
		fields.add( new UAVObjectField("Mixer6", "", UAVObjectField.FieldType.FLOAT32, Mixer6ElemNames, null) );

		List<String> Mixer7ElemNames = new ArrayList<String>();
		Mixer7ElemNames.add("0");
		fields.add( new UAVObjectField("Mixer7", "", UAVObjectField.FieldType.FLOAT32, Mixer7ElemNames, null) );

		List<String> Mixer8ElemNames = new ArrayList<String>();
		Mixer8ElemNames.add("0");
		fields.add( new UAVObjectField("Mixer8", "", UAVObjectField.FieldType.FLOAT32, Mixer8ElemNames, null) );


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
		metadata.flightTelemetryUpdatePeriod = 1000;

		metadata.loggingUpdateMode = UAVObject.UpdateMode.UPDATEMODE_PERIODIC;
		metadata.loggingUpdatePeriod = 1000;
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
			MixerStatus obj = new MixerStatus();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public MixerStatus GetInstance(UAVObjectManager objMngr, int instID)
	{
	    return (MixerStatus)(objMngr.getObject(MixerStatus.OBJID, instID));
	}

	// Constants
	protected static final int OBJID = 0xF6A33F10;
	protected static final String NAME = "MixerStatus";
	protected static String DESCRIPTION = "Status for the matrix mixer showing the output of each mixer after all scaling";
	protected static final boolean ISSINGLEINST = 1 == 1;
	protected static final boolean ISSETTINGS = 0 == 1;
	protected static int NUMBYTES = 0;


}