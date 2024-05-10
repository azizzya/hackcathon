import { ISVGComponentProps } from '../../interfaces/SVGComponent.interfaces';

export const MenuSVGComponent: React.FC<ISVGComponentProps> = ({
	fillColor,
	height,
	width,
}) => {
	return (
		<svg
			fill={fillColor}
			width={width}
			height={height}
			viewBox='0 0 22 18'
			xmlns='http://www.w3.org/2000/svg'
		>
			<path
				fillRule='evenodd'
				clipRule='evenodd'
				d='M1.62499 0.964233H20.375C20.7302 0.964233 21.0708 1.10534 21.322 1.3565C21.5732 1.60767 21.7143 1.94832 21.7143 2.30352C21.7143 2.65872 21.5732 2.99937 21.322 3.25054C21.0708 3.5017 20.7302 3.64281 20.375 3.64281H1.62499C1.26979 3.64281 0.929138 3.5017 0.677973 3.25054C0.426808 2.99937 0.285706 2.65872 0.285706 2.30352C0.285706 1.94832 0.426808 1.60767 0.677973 1.3565C0.929138 1.10534 1.26979 0.964233 1.62499 0.964233ZM1.62499 7.92852H20.375C20.7302 7.92852 21.0708 8.06962 21.322 8.32079C21.5732 8.57195 21.7143 8.9126 21.7143 9.26781C21.7143 9.62301 21.5732 9.96366 21.322 10.2148C21.0708 10.466 20.7302 10.6071 20.375 10.6071H1.62499C1.26979 10.6071 0.929138 10.466 0.677973 10.2148C0.426808 9.96366 0.285706 9.62301 0.285706 9.26781C0.285706 8.9126 0.426808 8.57195 0.677973 8.32079C0.929138 8.06962 1.26979 7.92852 1.62499 7.92852ZM1.62499 14.8928H20.375C20.7302 14.8928 21.0708 15.0339 21.322 15.2851C21.5732 15.5362 21.7143 15.8769 21.7143 16.2321C21.7143 16.5873 21.5732 16.9279 21.322 17.1791C21.0708 17.4303 20.7302 17.5714 20.375 17.5714H1.62499C1.26979 17.5714 0.929138 17.4303 0.677973 17.1791C0.426808 16.9279 0.285706 16.5873 0.285706 16.2321C0.285706 15.8769 0.426808 15.5362 0.677973 15.2851C0.929138 15.0339 1.26979 14.8928 1.62499 14.8928Z'
			/>
		</svg>
	);
};
