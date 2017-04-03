package pl.pcz.client;

import com.google.gwt.core.client.EntryPoint;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Anchor;


public class petstore implements EntryPoint {


    public void onModuleLoad() {
	  createStartPage(RootPanel.get());
  }

	public void createStartPage(RootPanel rootPanel) {
		
	final VerticalPanel vPanel = new VerticalPanel();
		Label header = new Label("Petstore");
		DecoratorPanel decoratorPanel = new DecoratorPanel();
    		FlowPanel flowPanel = new FlowPanel();
		Label footer = new Label("Kontakt");
		Anchor anchor = new Anchor("office@petstore.pcz.pl");

		    FlexCellFormatter cellFormatter = ft.getFlexCellFormatter();
		    ft.addStyleName("cw-FlexTable");
		    ft.setWidth("32em");
		    ft.setCellSpacing(5);
		    ft.setCellPadding(3);

		vPanel.add(HorizontalPanelFunction());
		flowPanel.add(footer);
		flowPanel.add(anchor);
		vPanel.add(flowPanel);
		vPanel.add(header);
		rootPanel.add(flowPanel);
		rootPanel.add(vPanel);
	}
	
	public HorizontalPanel HorizontalPanelFunction() {

		HorizontalPanel hl = new HorizontalPanel();
		FlexTable ft = new FlexTable();
		hl.add(ft);
		return hl;
	}

}
