import { UseClock } from "./UserClock";

export function MyClock () {
    const [time,ampm] = UseClock();
    return (
        <div id = "Clock-style" style={{textAlign: "center"}}>
        {time}
        <span>
        {ampm}
        </span>

        </div>
    )
}