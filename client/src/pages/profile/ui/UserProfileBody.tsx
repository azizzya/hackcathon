import { IUserProfileBodyProps } from '../model/interfaces';

const UserProfileBody: React.FC<IUserProfileBodyProps> = ({
	username,
	firstname,
	lastname,
	profileImg,
	qrCodeImg,
}) => {
	return (
		<div className='page-wrapper'>
			<div className='profile-info'>
				<div className='profile-info-img'>
					<img src={profileImg} />
				</div>
				<div className='profile-info-text-name'>
					{`${firstname} ${lastname}`}
				</div>
				<div className='profile-info-text-login'>{username}</div>
				<img className='profile-qr' src={qrCodeImg} />
			</div>
		</div>
	);
};

export default UserProfileBody;
