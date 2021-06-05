import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calc {

	protected Shell shlSimpleCalculator;
	private Text firstNumber;
	private Text secondNumber;
	private boolean stop = false;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calc window = new Calc();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSimpleCalculator.open();
		shlSimpleCalculator.layout();
		while (!shlSimpleCalculator.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	/**
	 * Gets the number from the text box.
	 * @param t text box with the number
	 * @param s first or second, depending on the text box
	 * @return the number written inside the text box
	 */
	protected double getNumber(Text t, String s) {
		double num = 0;
		try {
			num = Double.parseDouble(t.getText());
		} catch(Exception e1) {
			MessageDialog.openError(shlSimpleCalculator, "Error", "Bad " + s + " number!");
			stop = true;
		}
		return num;
	}
	
	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSimpleCalculator = new Shell();
		shlSimpleCalculator.setSize(450, 300);
		shlSimpleCalculator.setText("Simple Calculator");
		
		Label firstNumberLabel = new Label(shlSimpleCalculator, SWT.NONE);
		firstNumberLabel.setBounds(30, 10, 118, 20);
		firstNumberLabel.setText("First Number:");
		
		firstNumber = new Text(shlSimpleCalculator, SWT.BORDER);
		firstNumber.setBounds(30, 44, 153, 26);
		
		Label secondNumberLabel = new Label(shlSimpleCalculator, SWT.NONE);
		secondNumberLabel.setBounds(30, 91, 118, 20);
		secondNumberLabel.setText("Second Number:");
		
		secondNumber = new Text(shlSimpleCalculator, SWT.BORDER);
		secondNumber.setBounds(30, 132, 153, 26);
		
		Label answerLabel = new Label(shlSimpleCalculator, SWT.NONE);
		answerLabel.setBounds(30, 180, 153, 52);
		answerLabel.setText("The answer is:");
		
		Button addButton = new Button(shlSimpleCalculator, SWT.NONE);
		addButton.addSelectionListener(new SelectionAdapter() {
			double num1, num2;
			@Override
			public void widgetSelected(SelectionEvent e) {
				num1 = getNumber(firstNumber, "first");
				if(stop) {
					stop = false;
					return;
				}
				num2 = getNumber(secondNumber, "second");
				if(stop) {
					stop = false;
					return;
				}
				
				double answer = num1 + num2;
				answerLabel.setText("The answer is: " + answer);
			}
		});
		addButton.setBounds(223, 44, 90, 30);
		addButton.setText("+");
		
		Button subtrButton = new Button(shlSimpleCalculator, SWT.NONE);
		subtrButton.addSelectionListener(new SelectionAdapter() {
			double num1, num2;
			@Override
			public void widgetSelected(SelectionEvent e) {
				num1 = getNumber(firstNumber, "first");
				if(stop) {
					stop = false;
					return;
				}
				num2 = getNumber(secondNumber, "second");
				if(stop) {
					stop = false;
					return;
				}
				
				double answer = num1 - num2;
				answerLabel.setText("The answer is: " + answer);
			}
		});
		subtrButton.setBounds(332, 44, 90, 30);
		subtrButton.setText("-");
		
		Button mulButton = new Button(shlSimpleCalculator, SWT.NONE);
		mulButton.addSelectionListener(new SelectionAdapter() {
			double num1, num2;
			@Override
			public void widgetSelected(SelectionEvent e) {
				num1 = getNumber(firstNumber, "first");
				if(stop) {
					stop = false;
					return;
				}
				num2 = getNumber(secondNumber, "second");
				if(stop) {
					stop = false;
					return;
				}
				
				double answer = num1 * num2;
				answerLabel.setText("The answer is: " + answer);
			}
		});
		mulButton.setBounds(223, 91, 90, 30);
		mulButton.setText("*");
		
		Button divButton = new Button(shlSimpleCalculator, SWT.NONE);
		divButton.addSelectionListener(new SelectionAdapter() {
			double num1, num2;
			@Override
			public void widgetSelected(SelectionEvent e) {
				num1 = getNumber(firstNumber, "first");
				if(stop) {
					stop = false;
					return;
				}
				num2 = getNumber(secondNumber, "second");
				if(stop) {
					stop = false;
					return;
				}
				
				double answer = num1 / num2;
				answerLabel.setText("The answer is: " + answer);
			}
		});
		divButton.setBounds(332, 91, 90, 30);
		divButton.setText("/");

	}
}
