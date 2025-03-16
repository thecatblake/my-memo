use std::arch::asm;

#[inline(never)]
fn syscall(message: String) {
    let msg_ptr = message.as_ptr();
    let len = message.len();

    unsafe {
        asm!{
            "ldr rax"
        }
    }
}