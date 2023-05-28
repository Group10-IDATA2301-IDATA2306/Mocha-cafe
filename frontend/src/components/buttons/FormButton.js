import "./FormButton.css"

/**
 * A button for forms.
 * 
 * @param {*} props text to be displayed on button
 * @returns {JSX.Element} a button with the desired text
 */
export function FormButton(props) {
    return (
        <button className="formButton">{props.text}</button>
    );
}