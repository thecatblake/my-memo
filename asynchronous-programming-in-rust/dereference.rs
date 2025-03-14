use std::arch::asm;

fn main() {
    let t = 100000000;
    let t_ptr: *const usize = &t;
    let x = dereference(t_ptr);
    println!("x: {}", x);
}

fn dereference(ptr: *const usize) -> usize {
    let mut res: usize;
    unsafe {
        asm!("ldr {0}, [{1}]", out(reg) res, in(reg) ptr);
    }
    res
}
