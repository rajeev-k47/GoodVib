<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">

# GoodVib (An Android compose library for Accessibility in vibration effects.)


## Prerequisites

Add this in your root `settings.gradle.kts` For (**`Kotlin DSL`**):

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url = uri("https://jitpack.io") }
    }
}
```

## Dependency

This library is available on [Jitpack](https://jitpack.io)

Add this to your module's `build.gradle` file (make sure to follow Prerequisites first):

```gradle
dependencies {
	...
	 implementation ("com.github.rajeev-k47:GoodVib:1.0.1")
}
```

## Usage

Define context which have to be passed in vib function
``` java
val context = LocalContext.current
```

Each method always returns `android.os.VibrationEffect`, and you can customize the Patterns much more.

To vibrate for a specific time (millisecond):

``` kotlin
GoodVib.vib(context,durationinmillis);
```

### Here are some patterns of vibrations which can be used in place of duration
Alert:

``` java
GoodVib.vib(context,VibPattern.Alert);
```
DoubleTap:

``` java
GoodVib.vib(context,VibPattern.DoubleTap);
```
ShortBurst (One of my favorite):

``` java
GoodVib.vib(context,VibPattern.ShortBurst);
```
LongBurst:

``` java
GoodVib.vib(context,VibPattern.LongBurst);
```
Buzz:

``` java
GoodVib.vib(context,VibPattern.Buzz);
```
Reminder:

``` java
GoodVib.vib(context,VibPattern.Reminder);
```

This library enchances the clicking effects in android by using different patterns of vibration signals.
If you really like my project do star my Repository.

Newer and Modified versions are yet to released. If you want to contribute to my project Please fork this repository and contribute back using
[pull requests](https://github.com/rajeev-k47/GoodVib/pulls).

<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">