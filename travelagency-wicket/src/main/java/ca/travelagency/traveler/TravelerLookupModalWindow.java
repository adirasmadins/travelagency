/**
 *    Copyright (C) 2010 - 2014 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package ca.travelagency.traveler;

import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.ResourceModel;

import ca.travelagency.invoice.InvoiceTraveler;

public class TravelerLookupModalWindow extends ModalWindow {
	private static final long serialVersionUID = 1L;

	static final String TITLE = "travelerLookupModalWindow.title";

	public TravelerLookupModalWindow(String id, Form<InvoiceTraveler> travelerForm) {
		super(id);

        setInitialWidth(1024);
        setInitialHeight(500);

        setTitle(new ResourceModel(TITLE));
        setContent(new TravelerLookupPanel(CONTENT_ID, travelerForm, this));
	}
}
