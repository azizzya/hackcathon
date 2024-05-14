import qrCodeImgPath from '@/shared/assets/thread-13090132-506909745012483037.png';
import profileImgPath from '@/shared/assets/secretarev.jpg';
import '@/shared/ui/shared.scss';
import './styles.scss';
export const ProfilePage: React.FC = () => {
	return (
		<div className='page-wrapper'>
			<div className='profile-info'>
				<div className='profile-info-img'>
					<img
						src={profileImgPath}
					/>
				</div>
				<div className='profile-info-text-name'>
					Андрей Секретарев
				</div>
				<div className='profile-info-text-login'>
					@asecretarev
				</div>
				<img
					className='profile-qr'
					src={qrCodeImgPath}
				/>
			</div>
		</div>
	);
};
