# AndroidLifeCycle Repository

Explore the AndroidLifeCycle repository, a simple Android application that logs the lifecycle events using `Log.d` and displays Toast messages on the screen. This repository provides a hands-on example of Android Activity Lifecycle management.

## Features:
- **Logging Lifecycle Events:** Utilizes `Log.d` statements to log various lifecycle events of the Android Activity.
- **Toast Messages:** Displays Toast messages on the screen for each lifecycle event, providing a visual indication of the lifecycle flow.

## Code Snippet:
```kotlin
package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifeCycle","onCreate Invoked")
        setContentView(R.layout.activity_main)
    }

    // Additional lifecycle methods with Log.d and Toast messages

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "onDestroy Invoked")
        Toast.makeText(this,"onDestroy Invoked",Toast.LENGTH_LONG).show()
    }
}
```

## Usage:
1. Clone the repository: `git clone https://github.com/your-username/AndroidLifeCycle.git`
2. Open the project in Android Studio.
3. Run the application on an emulator or physical device.
4. Observe the Logcat messages in Android Studio for detailed lifecycle logging.
5. Toast messages will appear on the screen for each lifecycle event.
   
## ScreenShot:
[Link to My Video](/activitylifecycle.webm)


Feel free to customize and extend the code to explore further Android lifecycle management concepts. Share your feedback, report issues, and contribute to enhancing this example! 🚀
