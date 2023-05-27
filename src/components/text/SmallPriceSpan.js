/**
 * A price tag for small product entities.
 * @param {*} props 
 * @returns 
 */
export function SmallPriceSpan(props) {
    return (
        <span className="smallPriceSpan">{props.text}</span>
    );
}