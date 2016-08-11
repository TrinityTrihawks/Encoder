

package org.usfirst.frc.team4215.robot;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    final String defaultAuto = "Default";
    final String customAuto = "My Auto";
    String autoSelected;
    Victor arm1 = new Victor(4);
    Victor arm2 = new Victor(6);
    Encoder encode = new Encoder(0,1,false,EncodingType.k1X);
   
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    }
    
	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString line to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the switch structure below with additional strings.
	 * If using the SendableChooser make sure to add them to the chooser code above as well.
	 */
    public void autonomousInit() {
		/*
		 * The following parameters of the encoder class may be set through the code:
		
		Max Period - The maximum period (in seconds) where the device is still considered moving. This value is used to determine the state of the getStopped() method and effect the output of the getPeriod() and getRate() methods. This is the time between pulses on an individual channel (scale factor is accounted for). It is recommended to use the Min Rate parameter instead as it accounts for the distance per pulse, allowing you to set the rate in engineering units.
		Min Rate - Sets the minimum rate before the device is considered stopped. This compensates for both scale factor and distance per pulse and therefore should be entered in engineering units (RPM, RPS, Degrees/sec, In/s, etc)
		Distance Per Pulse - Sets the scale factor between pulses and distance. The library already accounts for the decoding scale factor (1x, 2x, 4x) separately so this value should be set exclusively based on the encoder's Pulses per Revolution and any gearing following the encoder.
		Reverse Direction - Sets the direction the encoder counts, used to flip the direction if the encoder mounting makes the default counting direction unintuitive.
		Samples to Average - Sets the number of samples to average when determining the period. Averaging may be desired to account for mechanical imperfections (such as unevenly spaced reflectors when using a reflective sensor as an encoder) or as oversampling to increase resolution. Valid values are 1 to 127 samples.
		 */
    	
    	System.out.println("Hi Doug!!!");

    	encode.setDistancePerPulse(1);
        // encode.setMaxPeriod(.1);
        encode.setMinRate(.1);
        encode.setReverseDirection(true);
        encode.setSamplesToAverage(2);
    	encode.reset();
    	
    	/*
    	 * The following values can be retrieved from the encoder:
		Count - The current count. May be reset by calling reset().
		Raw Count - The count without compensation for decoding scale factor.
		Distance - The current distance reading from the counter. This is the count multiplied by the Distance Per Count scale factor.
		Period - The current period of the counter in seconds. If the counter is stopped this value may return 0. This is deprecated, it is recommended to use rate instead.
		Rate - The current rate of the counter in units/sec. It is calculated using the DistancePerPulse divided by the period. If the counter is stopped this value may return Inf or NaN, depending on language.
		Direction - The direction of the last value change (true for Up, false for Down)
		Stopped - If the counter is currently stopped (period has exceeded Max Period)
    	 */
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	//System.out.println("Distance: " + encode.getDistance());
    	System.out.println("Distance: " + encode.getDistance());
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
