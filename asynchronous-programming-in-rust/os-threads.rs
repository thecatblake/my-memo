use std::thread::{self, sleep};

// the time t1 and t2 is undetermined, but t3 will always run after t2

fn main() {
    let t1 = thread::spawn(|| {
        sleep(std::time::Duration::from_millis(100));
        println!("Hello from thread 1");
    });

    let t2 = thread::spawn(|| {
        sleep(std::time::Duration::from_millis(100));
        println!("Hello from thread 2");
        let t3 = thread::spawn(|| {
            sleep(std::time::Duration::from_millis(100));
            println!("Hello from thread 3");
        });
        t3.join().unwrap();
    });
    t2.join().unwrap();
    t1.join().unwrap();
}
