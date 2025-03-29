#include <stdint.h>
#include <stdio.h>
#include <time.h>
#include <mach/mach_time.h>

static const int kIterations = 1000 * 1000000;

int main(int argc, char** argv) {
    uint64_t startcy, stopcy;
    volatile uint64_t sum = 0;

    startcy = mach_absolute_time();

    // printf("Timer started\n");

    for (int i = 0; i < kIterations; i++)
        sum += 1;

    // printf("Timer stopped\n");
    
    stopcy = mach_absolute_time();
    int64_t elapsed = stopcy - startcy;
    double felapsed = elapsed;
    printf("%d iterations, %lld cpu cycles. %f iter/cycle\n", kIterations, elapsed, kIterations / felapsed);
    return 0;
}
